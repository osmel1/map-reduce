package org.example;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class TotalOneYearMapper extends Mapper<LongWritable, Text,Text, IntWritable> {

        @Override
        protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context) throws IOException, InterruptedException {
           // get the year value from the context.conf
            String year = context.getConfiguration().get("year");
            String[] values=value.toString().split(" ");
            // I assume that the date is in format yyyy-mm-dd
            if (values[0].startsWith(year)) {
                context.write(new Text( values[1]),new IntWritable(Integer.valueOf(values[3].toString())));
            }
        }

}
