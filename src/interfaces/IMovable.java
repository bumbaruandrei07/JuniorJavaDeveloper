package interfaces;

//este redundant să adăugăm entităților interfeței modificatorul de acces public
//O interfață, prin definitie, reprezintă subsetul de acțiuni disponibile (i.e. public) în cadrul claselor ce implementează acea interfață.
// Prin urmare, toți membrii interfeței sunt implicit public.
    public interface IMovable {
        // static & final fields:
        double metersToKilometers = .001;

        // abstract methods:
        void moveForward();
        void moveLeft();
        void moveRight();
        double getDistanceWalked();
    }

