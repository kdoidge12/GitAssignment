/**
 * Created by Kris on 2/6/2017.
 */
package edu.fsu.cs.cen4021.armory;

import edu.fsu.cs.cen4021.armory.BasicWeapon;
import edu.fsu.cs.cen4021.armory.Weapon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TheChosenOneAxe extends BasicWeapon implements Weapon {
    TheChosenOneAxe() {
        super(80);
        File f = new File("conf/thechosenone.txt");
        try {
            Scanner fileScan = new Scanner(f);
            int i = 1;

            String compare = fileScan.nextLine();

            while(compare.equals(fileScan.nextLine()))
            {
                i+=1;
            }
            if(i == 1)
            {this.DAMAGE = 1;}
            else{
            this.DAMAGE = i+1;}
            fileScan.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }

    }

    public int hit() {
        return this.DAMAGE;
    }

    public int hit(int armor) {
        int damage;
        if(armor > 0 || armor <20)
        {damage = this.DAMAGE;}
        else
        {damage = this.DAMAGE - armor;}

        return damage < 0?0:damage;
    }
}