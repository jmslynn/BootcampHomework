let expect = chai.expect;

describe('MyFunctions', function() {
  describe('#doSomething', function() {
    it('should concatenate two parameters', function() {
      let x = doSomething('Hello', 5);
      expect(x).to.equal('Hello5');
    });
    it('should throw an error if first parameter is not a string', function() {
      // wrap in expect to catch the error
      expect(function() {
        doSomething(5, 5);
      }).to.throw(Error);
    });
  });
});