function App() {
  const name = 'React'
  const boolVal = true
  return (
    <div className="container">
      <h1>Hello From React</h1>
      <h2>Hello { name }</h2>
      <h3>Hello { boolVal ? 'Yes' : 'No' }</h3>
    </div>
  );
}

export default App;