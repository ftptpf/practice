package main.java.schildt.other;

class Box {
    double weight;
    double height;
    double depth;
    Box(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }
    Box(Box ob) {
        weight = ob.weight;
        height = ob.height;
        depth = ob.depth;
    }
    Box() {
        weight = -1;
        height = -1;
        depth = -1;
    }
    Box(double len) {
        weight = height = depth = len;
    }
    double volume() {
        return weight*height*depth;
    }
}