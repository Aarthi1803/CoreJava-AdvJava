package com.solidprinciples.interface_segregation.good;
//Here dont need to bother about db part.
public class FileDaoConnection implements FileInterface,DAOInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }
}
