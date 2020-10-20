package cn.young.manager.service;

import cn.young.common.pojo.EasyUIDataGrid;
import cn.young.common.pojo.YoungResult;
import cn.young.manager.pojo.User;

/**
 * @author young
 */
public interface UserService {

    /**
     *  用户登录
     * @return
     */
    public User login(User user);
    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    public int regist(User user);
    /**
     * 修改密码
     * @return
     */
    public int updateUserPwd(User user);
    /**
     * 检查旧密码
     * @param user
     * @return
     */
    public User checkOldPwd(User user);
    User getUserById(long uid);

    /**
     *获取所有的用户
     */
    EasyUIDataGrid getUserList(int page, int rows);

    /**
     *删除用户
     */
    YoungResult deleteUser(long uid);

    /**
     * 通过uid获取用户名和用户头像
     * @param uid
     * @return
     */
    User getUnameAndUimage(int uid);

    /**
     * 验证信息
     */
    int validationInfo(User user);

}
