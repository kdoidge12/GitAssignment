/**
 * Created by Kris on 2/6/2017.
 */
package edu.fsu.cs.cen4021.armory;

import edu.fsu.cs.cen4021.armory.BasicWeapon;
import edu.fsu.cs.cen4021.armory.Weapon;

class SimpleArrow extends BasicWeapon implements Weapon {
    SimpleArrow() {
        super(70);
    }

    public int hit() {
        return this.DAMAGE;
    }

    public int hit(int armor) {
        int damage = this.DAMAGE - (armor-5);
        return damage < 0?0:damage;
    }
}