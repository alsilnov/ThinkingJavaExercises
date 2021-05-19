package com.silnov.thinkingjavaexercises.chapter16.exercise16;

interface Generator<T> {
    T next();

    T next(T n);
}

public class SkipGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;

        @Override
        public java.lang.Boolean next() {
            value = !value;
            return value;
        }

        @Override
        public java.lang.Boolean next(java.lang.Boolean n) {
            value = java.lang.Boolean.logicalOr(!value, n);
            return value;
        }
    }

    public static class Byte implements Generator<java.lang.Byte> {
        private byte value = 0;

        @Override
        public java.lang.Byte next() {
            return value++;
        }

        @Override
        public java.lang.Byte next(java.lang.Byte n) {
            return (byte) (value + n);
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

    public static class Character implements Generator<java.lang.Character> {
        int index = -1;

        @Override
        public java.lang.Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }

        @Override
        public java.lang.Character next(java.lang.Character n) {
            index = (index + n) % chars.length;
            return chars[index];
        }
    }

    public static class Short implements Generator<java.lang.Short> {
        private short value = 0;

        @Override
        public java.lang.Short next() {
            return value++;
        }

        @Override
        public java.lang.Short next(java.lang.Short n) {
            return (short) (value + n);
        }
    }

    public static class Integer implements Generator<java.lang.Integer> {
        private int value = 0;

        @Override
        public java.lang.Integer next() {
            return value++;
        }

        @Override
        public java.lang.Integer next(java.lang.Integer n) {
            return value + n;
        }
    }

    public static class Long implements Generator<java.lang.Long> {
        private long value = 0;

        @Override
        public java.lang.Long next() {
            return value++;
        }

        @Override
        public java.lang.Long next(java.lang.Long n) {
            return value + n;
        }
    }

    public static class Float implements Generator<java.lang.Float> {
        private float value = 0;

        @Override
        public java.lang.Float next() {
            float result = value;
            value += 1.0;
            return result;
        }

        @Override
        public java.lang.Float next(java.lang.Float n) {
            float result = value;
            value += n;
            return result;
        }
    }

    public static class Double implements Generator<java.lang.Double> {
        private double value = 0.0;

        @Override
        public java.lang.Double next() {
            double result = value;
            value += 1.0;
            return result;
        }

        @Override
        public java.lang.Double next(java.lang.Double n) {
            double result = value;
            value += n;
            return result;
        }
    }

}