public boolean isValidDay(int day, int month, int year) {
    
    //ตรวจสอบเดือนเกิน
    if (day < 1 || month < 1 || month > 12) {
        return false;
    }

    //ตรวจสอบวัน
    int maxDay;
    switch (month) {
        //ลงท้ายด้วยคม
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            maxDay = 31;
            break;
        //ลงท้ายด้วยยน
        case 4: case 6: case 9: case 11:
            maxDay = 30;
            break;
        //ลงท้ายด้วยพันธ์    
        case 2:
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDay = 29;
            } else {
                maxDay = 28;
            }
            break;
        default:
            return false;
    }

    return day <= maxDay;
}
