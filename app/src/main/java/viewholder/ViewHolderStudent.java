package viewholder;

import android.view.View;
import android.widget.TextView;

import com.ktd.khoaithanhdat.listviewexample.R;

/**
 * Created by Khoai thanh dat on 18-Nov-17.
 */

public class ViewHolderStudent {
    public TextView tvId;  //phai de public
    public TextView tvName;
    public TextView tvAddress;
    public ViewHolderStudent(View view){
        tvId=(TextView)view.findViewById(R.id.tvId);
        tvName=(TextView)view.findViewById(R.id.tvName);
        tvAddress=(TextView)view.findViewById(R.id.tvAddress);
    }

}
