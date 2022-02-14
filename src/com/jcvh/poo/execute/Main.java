package com.jcvh.poo.execute;

import com.jcvh.poo.domain.Doctor;
import static com.jcvh.poo.domain.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();

        showMenu();
    }
}
