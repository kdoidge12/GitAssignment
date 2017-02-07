/**
 * Created by Kris on 2/6/2017.
 */
package edu.fsu.cs.cen4021.armory;

import edu.fsu.cs.cen4021.armory.BasicWeapon;
import edu.fsu.cs.cen4021.armory.Weapon;

class SimpleMagicStaff extends BasicWeapon implements Weapon {
    SimpleMagicStaff() {
        super(80);
    }

    public int hit() {
        return this.DAMAGE;
    }

    public int hit(int armor) {
        int pen = (int) (armor * 0.8);
        int damage = this.DAMAGE - pen;

        return damage < 0?0:damage;
    }
}