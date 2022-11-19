import Header from "./components/Header";
import SalesCard from "./components/SalesCard";

function App() {
  return (
    // <> </>: fragmento: usado para abrir mais de um componente no react*/
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard />
          </div>
        </section>
      </main>
    </>
  )
}

export default App;
