import React from 'react';

function Signup() {
    return (
        <form>
            <input type="text" placeholder="Username" />
            <input type="email" placeholder="Email" />
            <input type="password" placeholder="Password" />
            <button type="submit">Signup</button>
        </form>
    );
}

export default Signup;