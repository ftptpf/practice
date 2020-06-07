package ru.practice.schildt.other;

class Box {
    double weight;
    double height;
    double depth;
    Box(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
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