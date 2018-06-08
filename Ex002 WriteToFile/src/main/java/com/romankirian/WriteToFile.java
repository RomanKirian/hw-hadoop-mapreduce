package com.romankirian;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.io.IOUtils;

import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class WriteToFile
{
    public static void main( String[] args ) throws IOException {
        String str = "Hello HDFS!";
        InputStream in = new BufferedInputStream(new ByteArrayInputStream(str.getBytes()));

        Path path = new Path("/user/cloudera/hello.txt");
        Configuration conf = new Configuration();

        FileSystem fs = FileSystem.get(conf);

        FSDataOutputStream out = fs.create(path);

        IOUtils.copyBytes(in, out, conf);
    }
}