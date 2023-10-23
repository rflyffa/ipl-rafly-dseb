class StudentCinema extends Cinema { 
    public StudentCinema(Double price) { 
        this.price = price; 
    }

    @Override
    Double calculateAdminFee() { 
        return price * 2 / 100; // Biaya admin untuk mahasiswa adalah 2% dari harga umum.
    }
}

public class Main {
    public static void main(String[] args) {
        StudentCinema studentCinema = new StudentCinema(100.0);
        Double adminFee = studentCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}
