package org.example;

public class StringRegex {

    private String stringForTaskOneAndTwo = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";
    private String stringForTaskThree = "test 2667843 (test_email@griddynamics.com) test 67483 some string";
    private String stringForTaskFour = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]";

    public String getStringForTaskOneAndTwo() {
        return stringForTaskOneAndTwo;
    }

    public String getStringForTaskThree() {
        return stringForTaskThree;
    }

    public String getStringForTaskFour() {
        return stringForTaskFour;
    }
}
