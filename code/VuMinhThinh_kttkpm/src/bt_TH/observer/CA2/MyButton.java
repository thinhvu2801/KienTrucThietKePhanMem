package bt_TH.observer.CA2;

public class MyButton {

    OnClickListener listener;

    public void attach(OnClickListener listener)
    {
        this.listener = listener;
    }
    public void detach()
    {
        listener = null;
    }
    public void Click()
    {
        if(listener != null)
            listener.OnClick();
    }


    public interface OnClickListener{
        void OnClick();
    }

}