import { useContext } from 'react'
import { GlobalContext } from "../context/GlobalState"
import Skeleton from './skeleton'

const Card = ({ type, title, value, link }) => {
  const { loading } = useContext(GlobalContext)
  return (
    <>
      <a className={`card ${type}`}>
        <h3>{title} &rarr;</h3>
        <div>{
          loading ? <Skeleton width="80" height="20" /> : value
        }</div>
      </a>

      <style jsx>{`
        .card {
          margin: 1rem;
          flex-basis: 20%;
          min-width: 200px;
          padding: 1.5rem;
          text-align: left;
          color: inherit;
          text-decoration:  none;
          border: 1px solid #eaeaea;
          border-radius: 10px;
          transition: color 0.15s ease, border-color 0.15s ease;
        }

        .card.confirmed {
          color: #ff9800;
          border-color: #ff9800;
        }

        .card.death {
          color: #ef5350;
          border-color: #ef5350;
        }

        .card.recovered {
          color: #1de9b6;
          border-color: #1de9b6;
        }
  
        .card.confirmed:hover,
        .card.confirmed:focus,
        .card.confirmed:active {
          color: #ff6d00;
          border-color: #ff6d00;
        }

        .card.death:hover,
        .card.death:focus,
        .card.death:active {
          color: #b71c1c;
          border-color: #b71c1c;
        }

        .card.recovered:hover,
        .card.recovered:focus,
        .card.recovered:active {
          color: #00bfa5;
          border-color: #00bfa5;
        }
  
        .card h3 {
          margin: 0 0 1rem 0;
          font-size: 1.5rem;
        }
  
        .card div {
          margin: 0;
          font-size: 1.25rem;
          line-height: 1.5;
        }
      `}</style>
    </>
  )
}

export default Card
