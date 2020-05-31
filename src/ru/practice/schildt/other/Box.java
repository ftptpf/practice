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
    double volume() {
        return weight*height*depth;
    }
}