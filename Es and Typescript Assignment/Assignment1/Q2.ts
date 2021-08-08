function check(a) {
  if (a % 2 == 0) {
    let out = 'Even';
  } else {
    let out = 'odd';
  }
  return out; // throws Error: out is not defined
}

console.log(check(25));
