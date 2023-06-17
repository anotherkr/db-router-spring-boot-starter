package cn.bugstack.middleware.db.router;

/**
 *  数据源基础配置
 * @author 吉良吉影
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}
