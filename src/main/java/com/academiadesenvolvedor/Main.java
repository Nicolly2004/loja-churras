package com.academiadesenvolvedor;

import com.academiadesenvolvedor.aplication.App;
import com.academiadesenvolvedor.persistence.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        App app = new App(scanner);


        app.executar();

        scanner.close();
    }
}