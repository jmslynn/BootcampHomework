import './App.css';
import MovieList from './components/movie-list';
import { MOVIES } from './shared/data';

function App() {
  return (
    <div className="container">
      <h1>My Movie Review Site</h1>
      <MovieList movies={MOVIES}/>
    </div>
  );
}

export default App;
