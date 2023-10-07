package seminars.third.hw;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
      /**
     * Функция проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false)
     * @param n - проверяемое число
     * @return возвращает результат - true - если число чётное, false, если число нечётное
     */
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // HW 3.2. покрыть тестами метод на 100%

    /**
     * Функция проверяет, попадает ли переданное число в интервал (25;100)
     * @param n - проверяемое число
     * @return возвращает true - если число входит в интервал (25;100), false, если число не входит в указанный интервал
     */
    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}
