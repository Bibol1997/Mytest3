package kz.kaz;

import java.util.Scanner;

public class Board {

    public static void Game(){

        Scanner in = new Scanner(System.in); // Подключение класса считывания инф-и (аля Read)
        String hole; // переменная местоположения

        String[][] field = new String[3][3];
        // Заполняем массив пробелами, для последущего замещения их Х или О
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                field[i][j] = (" [ ] ");
                System.out.print(field[i][j]);
            }
        }

        int i = 2;
        int quit=0;
        while((i<11) & (quit == 0)){

            if (i % 2 == 0){
                System.out.println("\nХодит Х");
            }
            else{
                System.out.println("\nХодит О");
            }
            System.out.print("Введите клетку:> ");
            // Считывание ввода, и ход.
            switch (hole = in.next()){
                case "7":{
                    if (field[0][0] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[0][0] = (" [X] ");
                            i++;
                            break;
                        }
                        else {
                            field[0][0] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }

                case "8":{
                    if (field[0][1] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[0][1] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[0][1] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                case "9":{
                    if (field[0][2] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[0][2] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[0][2] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                case "4":{
                    if (field[1][0] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[1][0] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[1][0] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                case "5":{
                    if (field[1][1] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[1][1] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[1][1] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                case "6":{
                    if (field[1][2] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[1][2] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[1][2] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                case "1":{
                    if (field[2][0] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[2][0] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[2][0] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                case "2":{
                    if (field[2][1] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[2][1] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[2][1] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                case "3":{
                    if (field[2][2] == (" [ ] ")){
                        if (i % 2 == 0){
                            field[2][2] = (" [X] ");
                            i++; break;
                        }
                        else {
                            field[2][2] = (" [O] ");
                            i++; break;
                        }
                    }
                    else{
                        System.out.println("Эта клетка занята, введите другую."); break;
                    }
                }
                default:
                    System.out.println("\nОшибка ведите еще раз!");
                    break;
            }
            // Вывод поля на экран
            for (int p = 0; p < 3; p++){
                System.out.println();
                for (int l = 0; l < 3; l++){
                    System.out.print(field[p][l]);
                }
            }
            for (int t = 0; t<3 ; t++){
                // Проверка прямых
                if      (((field[t][0]) == " [O] " & (field[t][1]) == " [O] " & field[t][2] == " [O] ") ||
                        ((field[0][t]) == " [O] " & (field[1][t]) == " [O] " & field[2][t] == " [O] ")) {
                    System.out.print("\nПобедил  О ");
                    quit++; Exit();
                }
                else if (((field[t][0]) == " [X] " & (field[t][1]) == " [X] " & field[t][2] == " [X] ") ||
                        ((field[0][t]) == " [X] " & (field[1][t]) == " [X] " & field[2][t] == " [X] ")) {
                    System.out.print("\nПобедил  Х ");
                    quit++; Exit();
                }
                else {}
            }
            // Проверка диагоналей
            if      (((field[0][0]) == " [X] " & (field[1][1]) == " [X] " & field[2][2] == " [X] ") ||
                    ((field[0][2]) == " [X] " & (field[1][1]) == " [X] " & field[2][0] == " [X] ")) {
                System.out.print("\nПобедил  Х ");
                quit++; Exit();
            }
            else if (((field[0][0]) == " [O] " & (field[1][1]) == " [O] " & field[2][2] == " [O] ") ||
                    ((field[0][2]) == " [O] " & (field[1][1]) == " [O] " & field[2][0] == " [O] ")) {
                System.out.print("\nПобедил  О ");
                quit++; Exit();
            }
            else {}
        }
        System.out.println();
    }
    public static void Exit(){ // Отсутствует продолжение игры
        Scanner ex = new Scanner(System.in);
        String re;
        do {
            System.out.print("Хотите продолжить игру? ");
            re = ex.next();
            if (re == "Y"){
                Game();
            }
            else if(re == "n") {
                break;
            }
        } while (re == ("Y") || re == "n");
    }
    public static void main(String[] args) {
        Game();
        //Exit();
    }
}