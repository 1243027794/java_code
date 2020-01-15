package generic;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2019/12/23 15:00
 */
public class Generic<Type> {
    private Type var;

    public Type getVar() {
        return var;
    }

    public void setVar(Type var) {
        this.var = var;
    }

    public Generic(Type var) {
        this.var = var;
    }

    public Generic() {

    }
}
