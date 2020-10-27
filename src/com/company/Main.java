package com.company;

public class Main {

    public static void main(String[] args) {
        Weapons weaponBoss = new Weapons();
        weaponBoss.setWeaponName("Daydalus");
        weaponBoss.setWeaponType("Sword");
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(1800);
        boss.setWeapons(weaponBoss);

        System.out.println("Boss health: " + boss.getHealth() +
                "\nBoss damage: " + boss.getDamage() +
                "\nBoss sword name: " + boss.getWeapons().getWeaponName() +
                "\nBoss sword type: " + boss.getWeapons().getWeaponType());
    }
}
