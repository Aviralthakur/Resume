import logo from './logo.svg';
import{BrowserRouter as Router, Routes,Route} from "react-router-dom";
import './App.css';
import Resume from './resume';
import EditPersonal from './EditPersonal';
function App() {
  return (
    <div className="App">
       <Router >
    <Routes>
    <Route path='/' exact element={ <Resume/> } />
    <Route path='/edit' exact element={ <EditPersonal/> } />
    </Routes>
    </Router>
    </div>
  );
}

export default App;
