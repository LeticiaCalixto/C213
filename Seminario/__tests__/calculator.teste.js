const calculator = require('../calculator')

//HAPPY PATH
describe("SOMA", () => {
        it("Soma de 1 e 2 deve ser 3", () => {
            // arrange and act
            var result = calculator.sum(1,2)
            // assert
            expect(result).toBe(3);
    });
});
describe("SUBTRAÇÃO", () => {
    it("Subtração de 1 e 2 deve ser -1", () => {
        // arrange and act
        var result = calculator.diff(1,2)
        // assert
        expect(result).toBe(-1);
});
});
describe("MULTIPLICAÇÃO", () => {
    it("Multiplicação de 2 e 2 deve ser 4", () => {
        // arrange and act
        var result = calculator.mult(2,2)
        // assert
        expect(result).toBe(4);
});
});
describe("DIVISÃO", () => {
    it("Divisão de 10 por 2 deve ser 5", () => {
        // arrange and act
        var result = calculator.div(10,2)
        // assert
        expect(result).toBe(5);
});
});

//SAD PATH
describe("ERRO DE DIVISÃO POR 0", () => {
    it("Divisão de qualquer numero por 0 deve ser NULL", () => {
        // arrange and act
        var result = calculator.div(2,0)
        // assert
        expect(result).toBeNull;
});
});
