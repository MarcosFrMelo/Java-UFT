package questao1.entidades;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Data {
    private LocalDate data; 

    private static final DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Data(){
    }

    public Data(LocalDate data) {
        this.data = data;
    }

    public int getDia(){
        return data.getDayOfMonth();
    }

    public int getMes(){
        return data.getMonthValue();
    }

    public Month getMesExtenso(){
        return data.getMonth();
    }
    
    public int getAno(){
        return data.getYear();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public static DateTimeFormatter getFmt01() {
        return fmt01;
    }

    public int compara(LocalDate data2){
        if (data == data2)
            return 0;
        if (data.getYear() > data2.getYear()) 
            return 1;
        else if (data.getYear() < data2.getYear()) 
            return -1;
        else {
            if (data.getMonthValue() > data2.getMonthValue())
                return 1;
            else if (data.getMonthValue() < data2.getMonthValue()) 
                return -1;
            else{
                if (data.getDayOfMonth() > data2.getDayOfMonth())
                    return 1;
                else
                    return -1;
            }
        }    
    }

    public LocalDate cloneData(LocalDate data){
        this.data = data;
        return this.data;
    }

    public boolean anoParOuImpar(){
        if (data.getYear() % 2 == 0)
            return true;
        return false;    
    }

    public void printarData(){
        System.out.println(data.getDayOfMonth()+"/"+data.getMonthValue()+"/"+data.getYear());
    }
}   
