package com.zking.my.shiro;

import com.zking.my.model.SYSNode;
import com.zking.my.model.SYSRole;
import com.zking.my.model.SYSUser;
import com.zking.my.service.Borrowing.ISUser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.List;

/**
 * 自定义Realm
 */
public class UserRealm extends AuthorizingRealm {


    //
    private static final Integer LOCKED = new Integer(1);
//
//    //用户对应的角色信息与权限信息都保存在数据库中，通过IUserBiz获取数据
    private ISUser isUser;
//
    public UserRealm() {
    }
//
    public UserRealm(CacheManager cacheManager) {
        super(cacheManager);
    }
//
    public UserRealm(CredentialsMatcher matcher) {
        super(matcher);
    }
//
    public UserRealm(CacheManager cacheManager, CredentialsMatcher matcher) {
        super(cacheManager, matcher);
    }
//
    public void setUserBiz(ISUser isUser) {
        this.isUser = isUser;
    }
//
//    /**
//     * 返回一个唯一的Realm名字
//     *
//     * @return
//     */
//    @Override
    public String getName() {
        return "UserRealm";//WeixinRealm,QqRealm,WeixinQqRealm
    }
//
//    /**
//     * 判断此Realm是否支持此Token
//     *
//     * @param token
//     * @return
//     */
//    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;//仅支持UsernamePasswordToken类型的Token
    }
//
//    /**
//     * 提供用户信息返回授权信息
//     *
//     * @param principalCollection
//     * @return
//     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //查询用户已授予的角色及权限
        String username = (String) principalCollection.getPrimaryPrincipal();
        SYSUser user = new SYSUser();
        user.setUsername(username);
        SYSRole sysRole = isUser.listPermissionsByUserName(user);
        List<SYSNode> sysNodes = isUser.listRolesByUserName(user);
//        Set<String> permissions = userBiz.listPermissionsByUserName(user);
//        Set<String> roles = userBiz.listRolesByUserName(user);

        //返回授权信息
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        authorizationInfo.setRoles(sysNodes);//
//        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;
    }

//    /**
//     * 提供用户信息返回认证信息(此时未进行密码比较)
//     *
//     * @param authenticationToken
//     * @return
//     * @throws AuthenticationException
//     */
//    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //查询用户已授予的角色及权限
        String username = (String) authenticationToken.getPrincipal();
        SYSUser user = new SYSUser();
        user.setUsername(username);
        System.out.println(username);
        SYSUser u = isUser.loadByUsername(user);
        System.out.println(11111111);
        if (null == u) {
            throw new UnknownAccountException();//帐号不存在
        }
        if (LOCKED.equals(u.getLocked())) {
            throw new LockedAccountException(); //帐号已锁定
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                u.getUsername(),
                u.getPassword(),
                ByteSource.Util.bytes(u.getSalt()),
                getName()
        );
        return authenticationInfo;
    }
}
