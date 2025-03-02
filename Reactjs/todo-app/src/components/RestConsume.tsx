    import axios from "axios";
    import { useState } from "react";

    interface Post {
    userid: "number";
    id: "number";
    title: "string";
    body: "string";
    }

    const RestConsume = () => {
    let [posts, setposts] = useState<Post[]>([]);
    let callApi = async () => {
        let response = await axios.get<Post[]>(
        "https://jsonplaceholder.typicode.com/posts/"
        );
        console.log(response);
        setposts(response.data)
        let list = response.data;
        <ul className="list-group"></ul>;
    };

    return (
        <>
        <button type="button" className="btn btn-success" onClick={callApi}>
            Fetch
        </button>
        <table className="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Title</th>
                <th scope="col">Body</th>
            </tr>
            </thead>
            <tbody>
            {posts.map((post) => (
                <tr key={post.id}>
                <td>{post.id}</td>
                <td>{post.title}</td>
                <td>{post.body}</td>
                </tr>
            ))}
            </tbody>
        </table>
        </>
    );
    };
    export default RestConsume;
