import React, { useState } from 'react'
import './App.css'

const App = () => {
    const [myName, setMyName] = useState("React School")
    let changeName = () => {
        setMyName("Rohit")
    }
  return (
    <div>
        <h1>{ myName }</h1>
        <button onClick={changeName}>Click Here</button>
    </div>
  )
}
export default App
