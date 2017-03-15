package ace.know.you.ado.selectionsort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] arrTest = new int[]{5,3,7,8,2,1,1,2,4,6};
        int[] arrResult = SelectionSort(arrTest);
        Log.d("test", "onCreate: ");


    }


    /**
     * SelectionSort
     * @param arr
     * @return
     */
    public int[] SelectionSort(int [] arr)
    {

        //再选其他
        for(int m=0;m<arr.length;m++) {

            //选出最小的数

            int k = m;//记录较小的位置序号
            for (int i = m + 1; i < arr.length; i++) {
                if (arr[k] > arr[i]) {
                    k = i;
                }
            }
            int temp = arr[m];
            arr[m] = arr[k];
            arr[k] = temp;
        }

        return arr;

    }

}
