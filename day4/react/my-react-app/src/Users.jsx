import React, { useEffect, useState } from 'react'
import axios from 'axios'; //npm install axios 

export default function Users() {
    const [users, setUsers] = useState([])
    useEffect(() => {
        axios.get('https://api.github.com/users')
        .then(response => {
            setUsers(response.data)
        })
    }, [])

  return (
    <div>
        {JSON.stringify(users)}
    </div>
  )
}
