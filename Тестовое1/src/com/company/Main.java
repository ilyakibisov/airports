package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(
                "airports.dat"));

        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Airports> airports = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            Airports air = new Airports();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                data = data.replaceAll("^\"|\"$", "");
                if (index == 0) {
                    air.setId(Integer.parseInt(data));
                }
                else if (index == 1)
                    air.setName(data);
                else if (index == 2)
                    air.setTown(data);
                else if (index == 3)
                    air.setCountry(data);
                else if (index == 4)
                    air.setCodeA(data);
                else if (index == 5)
                    air.setCodeB(data);
                else if (index == 6)
                    air.setCoordinateA(data);
                else if (index == 7)
                    air.setCoordinateB(data);
                else if (index == 8)
                    air.setCoordinateC(data);
                else if (index == 9)
                    air.setCoordinateD(data);
                else if (index == 10)
                    air.setSide(data);
                else if (index == 11)
                    air.setLocation(data);
                else if (index == 12)
                    air.setAirport(data);
                else if (index == 13)
                    air.setOur(data);
                index++;
            }
            index = 0;
            airports.add(air);
        }

        reader.close();

        Collections.sort(airports, new Comparator<Airports>() {
            @Override
            public int compare(Airports o1, Airports o2) {
                String s1 = o1.getName();
                String s2 = o2.getName();
                return s1.compareToIgnoreCase(s2);
            }
        });

        System.out.println("Введите строку");

        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        index = in.nextInt();
        String word = str.nextLine();

        long start = System.currentTimeMillis();

        int i = 0;

        for (Airports air : airports){
            String temp;
            if (index == 1) {
                temp = Integer.toString(air.getId());
                if (temp.startsWith(word)) {
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 2) {
                temp = air.getName();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 3) {
                temp = air.getTown();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 4) {
                temp = air.getCountry();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 5) {
                temp = air.getCodeA();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 6) {
                temp = air.getCodeB();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 7) {
                temp = air.getCoordinateA();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 8) {
                temp = air.getCoordinateB();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 9) {
                temp = air.getCoordinateC();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 10) {
                temp = air.getCoordinateD();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 11) {
                temp = air.getSide();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 12) {
                temp = air.getLocation();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 13) {
                temp = air.getAirport();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }
            else if (index == 14) {
                temp = air.getOur();
                if (temp.startsWith(word)){
                    System.out.println(air.toString());
                    i++;
                }
            }

        }

        System.out.println("Количество найденных строк: " + i);
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время, затраченное на поиск: " + timeWorkCode + " мс.");
    }
}
