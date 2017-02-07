/**
 * Created by Kris on 2/6/2017.
 */
package edu.fsu.cs.cen4021.armory;

import edu.fsu.cs.cen4021.armory.BasicWeapon;
import edu.fsu.cs.cen4021.armory.Weapon;

class SimpleAxe extends BasicWeapon implements Weapon {
    SimpleAxe() {
        super(60);
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