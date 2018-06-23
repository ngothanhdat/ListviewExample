package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ktd.khoaithanhdat.listviewexample.R;

import java.util.ArrayList;

import model.StudentModel;
import viewholder.ViewHolderStudent;

/**
 * Created by Khoai thanh dat on 18-Nov-17.
 */

public class AdapterStudent extends BaseAdapter {
    private Context context;
    private ArrayList<StudentModel> studentModels;
private LayoutInflater layoutInflater;
public AdapterStudent(Context context,ArrayList<StudentModel> studentModels){
    this.context=context;
    this.studentModels=studentModels;
    this.layoutInflater=LayoutInflater.from(context);
}
    @Override
    public int getCount() {
        return studentModels.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderStudent viewHolderStudent;
      if(view==null){
          view=layoutInflater.inflate(R.layout.item_student,viewGroup,false);

          viewHolderStudent=new ViewHolderStudent(view);
          view.setTag(viewHolderStudent);
      }
      else{
          viewHolderStudent= (ViewHolderStudent) view.getTag();
      }
        /*TextView tvId=(TextView)view.findViewById(R.id.tvId);
    TextView tvName=(TextView)view.findViewById(R.id.tvName);
      TextView tvAddress=(TextView)view.findViewById(R.id.tvAddress);*/

      StudentModel studentModel=studentModels.get(i);

      String id=studentModel.getId();
      String name=studentModel.getName();
      String address=studentModel.getAddress();

      viewHolderStudent.tvId.setText(id);
      viewHolderStudent.tvName.setText(name);
      viewHolderStudent.tvAddress.setText(address);
        return view;
    }

}
