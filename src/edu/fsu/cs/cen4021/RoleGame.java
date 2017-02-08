package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon a_staff = WeaponFactory.getWeapon("AncientMagicStaff");
        Weapon sword = WeaponFactory.getWeapon("sword");
        Weapon s_arrow = WeaponFactory.getWeapon("SimpleArrow");
        Weapon s_axe = WeaponFactory.getWeapon("SimpleAxe");
        Weapon s_staff = WeaponFactory.getWeapon("SimpleMagicStaff");
        Weapon c_axe = WeaponFactory.getWeapon("TheChosenOneAxe");

        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("AncientMagicStaff has " + a_staff.hit() + " of damage.");
        System.out.println("AncientMagicStaff was able to do " + a_staff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("SimpleArrow has " + s_arrow.hit() + " of damage.");
        System.out.println("SimpleArrow was able to do " + s_arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("SimpleAxe has " + s_axe.hit() + " of damage.");
        System.out.println("SimpleAxe was able to do " + s_axe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("SimpleMagicStaff has " + s_staff.hit() + " of damage.");
        System.out.println("SimpleMagicStaff was able to do " + s_staff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("TheChosenOneAxe has " + c_axe.hit() + " of damage.");
        System.out.println("TheChosenOneAxe was able to do " + c_axe.hit(armor) + " of damage due to an armor with " + armor + " points.");
        //TODO: Add the remaining weapons here

    }
}
