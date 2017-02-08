/**
 * Created by Kris on 2/6/2017.
 */
package edu.fsu.cs.cen4021.armory;

import edu.fsu.cs.cen4021.armory.BasicWeapon;
import edu.fsu.cs.cen4021.armory.Weapon;

import java.io.*;
import java.util.*;

import static java.sql.JDBCType.NULL;

class AncientMagicStaff extends BasicWeapon implements Weapon, Serializable {
    AncientMagicStaff() {
        super(80);

        try {
            FileInputStream fileIn = new FileInputStream("conf/ancientstaff.obj");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            int i = 1;
            this.DAMAGE = 0;
            List<Integer> des =(List<Integer>) in.readObject();
            ListIterator<Integer> iter = des.listIterator();
            while(iter.hasNext())
            {
                int temp = iter.next();
                temp = temp*temp;
                iter.set(temp);

            }
            des.remove(4);
            des.remove(1);
            Collections.reverse(des);
            ListIterator<Integer> itera = des.listIterator();
            while(itera.hasNext())
            {
                int temp = itera.next();
                if(i==1 || i==3 || i==7)
                {
                    System.out.println(temp);
                    this.DAMAGE += temp;
                }
                i++;
            }
            System.out.println(des);

        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }

    }

    public int hit() {
        return this.DAMAGE;
    }

    public int hit(int armor) {
        int pen = (int) (armor * 0.75);
        int damage = this.DAMAGE - pen;

        return damage < 0?0:damage;
    }
}