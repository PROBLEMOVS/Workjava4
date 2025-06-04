
/*
Task 1
*/
function getDayofWeek(dayNumber) {
    const days = ["Понеділок", "Вівторок", "Середа", "Четвер", "П’ятниця", "Субота", "Неділя"];
    if (dayNumber >= 1 && dayNumber <= 7) {
        return days[dayNumber - 1];
    } else {
        return "Невірний номер дня";
    }
}
    /*
Task 4
*/
const arr = Array.from({ length: 50 }, (_, i) => i + 1);

arr.forEach(num => {
    const element = document.createElement(num % 2 === 0 ? 'div' : 'p');
    element.textContent = `Елемент ${num}`;
    document.body.appendChild(element);
});
       /*
Task 5
*/
const a = 3;
const ggg = a > 0
    ? () => document.body.textContent = "!"
    : () => document.body.textContent = "!!";
ggg();
      /*
Task 6
*/
const operations = {
    "+": (a, b) => a + b,
    "-": (a, b) => a - b,
    "*": (a, b) => a * b,
    "/": (a, b) => b !== 0 ? a / b : "Ошибка: деление на ноль!"
};

const a = parseFloat(prompt("Введите первое число:"));
const b = parseFloat(prompt("Введите второе число:"));
const op = prompt("Введите операцию (+, -, *, /):");

const callback = operations[op];

if (!callback) {
    alert("Ошибка: невідома операція!");
} else if (isNaN(a) || isNaN(b)) {
    alert("Ошибка: треба ввести числа!");
} else {
    alert("Результат: " + callback(a, b));
}
