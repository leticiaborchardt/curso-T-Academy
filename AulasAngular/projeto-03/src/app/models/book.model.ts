export interface Book{
    id:number,
    isbn:number,
    title:string,
    author:string,
    genre: string,
    pages:number,
}

export interface Genre{
    name:string,
    description:string
}