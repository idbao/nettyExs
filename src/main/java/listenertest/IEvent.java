package listenertest;

/**
 * Created by Administrator on 2017/8/23.
 * 事件
 */
public interface IEvent {
    void setEventListener(IEventListener arg);
    boolean clickBtn();
    boolean moveMouse();
}
