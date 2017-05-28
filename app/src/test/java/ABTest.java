/**
 * Created by andrewdonato on 5/28/17.
 */


import com.apptimize.Apptimize;
import com.apptimize.ApptimizeTest;


public class ABTest {

    protected void onCreate(){

        Apptimize.setup(this, "Bvqkgti87hsnh9XeXdrebyhggy8nWLc");

        Apptimize.runTest("Experimenting with Apptimize", new ApptimizeTest() {
            @Override
            public void baseline() {
                // Variant: Control Group
            }

            @SuppressWarnings("unused")
            public void variation1() {
                // Variant: Experimental Group
            }
        });


    }

}
