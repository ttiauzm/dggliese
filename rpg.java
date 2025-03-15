package PBO;

class entity {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;

    public entity(String name, int health, int damage, int defense) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
    }

    public void attack (entity target) {
        int damageAfter = this.damage - target.defense;
        if (damageAfter < 0) {
            damageAfter = 0;
        }
        target.health -= damageAfter;
        System.out.println(this.name + " menyerang" + target.name + " dengan damage " + damageAfter);
        System.out.println(target.name + " sekarang memiliki health: " + target.health);
    }

    public void heal(int jumlah) {
        this.health += jumlah;
        System.out.println(this.name + " heal " + jumlah + " health");
    }

    public void displayInfo() {
        System.out.println(name + " Health: " + health + ", Damage: " + damage + ", Defense: " + defense);
    }
}

class warrior extends entity {
    public warrior(String name) {
        super(name, 15,10,3);
    }
    public void berserk(){
        this.damage += 5;
        System.out.println(name + " menggunakan berserk, damage meningkat menjadi " + this.damage);
    }
}

class tank extends entity {
    public tank(String name) {
        super(name,20,5,5);
    }
    public void taunt() {
        this.defense += 5;
        System.out.println(name + " menggunakan taunt, defense meningkat menjadi " + this.defense);
    }
}

class archer extends entity {
    public archer(String name) {
        super(name,10,15,1);
    }
    public void doubleShot(entity target) {
        this.attack(target);
        this.attack(target);
        System.out.println(name + " menggunakan double shot");
    }
}
public class rpg {
    public static void main(String[] args) {
        warrior w1 = new warrior("Tia");
        tank t1 = new tank("Tio");
        archer a1 = new archer("Ait");

        w1.displayInfo();
        t1.displayInfo();
        a1.displayInfo();

        System.out.println("\n========PHASE 1========");
        w1.attack(t1);
        t1.heal(2);
        a1.attack(w1);

        System.out.println("\n========PHASE 2========");
        w1.berserk();
        t1.taunt();
        a1.doubleShot(w1);
    }
}
