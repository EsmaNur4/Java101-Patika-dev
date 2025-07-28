package ödev;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Kacinci Ayda Dogdunuz: ");
        month = input.nextInt();
        System.out.print("Hangi Gun Dogdunuz: ");
        day = input.nextInt();
        switch (month) {
            case 1:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        burc = "Oglak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day > 0 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balik";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day > 0 && day <= 31) {
                    if (day < 21) {
                        burc = "Balik";
                    } else {
                        burc = "Koc";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day > 0 && day <= 30) {
                    if (day < 21) {
                        burc = "Koc";
                    } else {
                        burc = "Boga";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        burc = "Boga";
                    } else {
                        burc = "Ikizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        burc = "Ikizler";
                    } else {
                        burc = "Yengec";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengec";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Basak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        burc = "Basak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day > 0 && day <= 30) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oglak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;

        }
        if (isError) {
            System.out.println("Hatali Giris Yaptiniz");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}

