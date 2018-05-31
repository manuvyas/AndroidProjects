package com.example.manu.emailtest5;



import android.os.AsyncTask;


import android.util.Log;





/**


 * Created by GsolC on 2/24/2017.


 */





public class LongOperation extends AsyncTask<Void, Void, String> {


    @Override


    protected String doInBackground(Void... params) {


        try {




            GMailSender sender = new GMailSender("manuvyas.iot@gmail.com", "manuiot123");


            sender.sendMail("This is a testing mail",


                    "This is Body of testing mail","manuvyas.iot@gmail.com",


                    "manuvyas.iot@gmail.com")                   ;





        } catch (Exception e) {


            Log.e("error", e.getMessage(), e);


            return "Email Not Sent";


        }


        return "Email Sent";


    }





    @Override


    protected void onPostExecute(String result) {





        Log.e("LongOperation",result+"");


    }





    @Override


    protected void onPreExecute() {


    }





    @Override


    protected void onProgressUpdate(Void... values) {


    }


}