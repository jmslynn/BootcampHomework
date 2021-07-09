function askQuestion(question) {
  const answer = prompt(question);
  return answer;
}

const tomatoAnswer = askQuestion("Do you like tomatoes?");
alert(tomatoAnswer);