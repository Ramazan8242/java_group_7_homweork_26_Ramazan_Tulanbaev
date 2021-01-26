package com.company;

public interface Connection {
    void openADatabaseConnection();
    void closeTheDatabaseConnection();
    boolean checkIfThereIsAConnectionToTheBase();
    void readOneRecordByIndex();
    boolean checkIfThereIsAnEntryForSuchAndSuchAKey();
    void readOneRecordByKey();
    void readACertainSetOfRecordsFromTheDatabase();
    void findOutTheNumberOfRecordsInTheDatabase();
    void addRecordToBase();
    void updateRecordValueByIndex();
    void updateRecordContentByKey();
}
